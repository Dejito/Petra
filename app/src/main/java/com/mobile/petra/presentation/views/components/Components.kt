package com.mobile.petra.presentation.views.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobile.petra.utils.priceFilter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PetraAppBar(
    enabledBackButton: Boolean = true,
    title: String,
    elevation: Int = 5,
    backgroundColor: Color = Color.Transparent,
    textColor: Color = Color.Black,
    tint: Color = Color.Black,
    onClick: () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    padding: Int = 60
) {
    TopAppBar(
        colors = TopAppBarColors(
            containerColor = backgroundColor,
            actionIconContentColor = backgroundColor,
            navigationIconContentColor = backgroundColor,
            scrolledContainerColor = backgroundColor,
            titleContentColor = backgroundColor
        ),
        title = {
            Text(
                text = title, textAlign = TextAlign.Center,
                color = textColor,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = padding.dp)
            )
        },
        navigationIcon = {
            if (enabledBackButton) IconButton(onClick = { onClick() }) {
                Icon(
                    imageVector = Icons.Filled.ChevronLeft,
                    contentDescription = "Back button",
                    tint = tint,
                    modifier = Modifier
                        .size(28.dp)
                )
            }
        },
        actions = {
            actions()
        }
    )
}


@Composable
fun TitleText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: Int = 14, bottomPadding: Int = 8,
    color: Color = Color.Black, fontWeight: FontWeight = FontWeight.Normal,
    startPadding: Int = 0, textAlign: TextAlign = TextAlign.Start,
    topPadding: Int = 0, letterSpacing: Int = 0, lineHeight: Int = 25,
    isVisible: Boolean = true,
    maxLines: Int = 1,
    overflow: TextOverflow = TextOverflow.Visible
) {
    if (isVisible) {
        Text(
            text = text,
            fontSize = fontSize.sp,
            color = color,
            textAlign = textAlign, fontWeight = fontWeight, lineHeight = lineHeight.sp,
            letterSpacing = letterSpacing.sp,
            modifier = modifier.padding(
                bottom = bottomPadding.dp, start = startPadding.dp, top = topPadding.dp
            ),
            maxLines = maxLines,
            overflow = overflow
        )
    }
}

@Composable
fun KegowDivider(modifier: Modifier = Modifier, height: Double, color: Color = Color.Transparent) {
    Divider(
        modifier
            .height(height.dp),
        color = color
    )
}

@Composable
fun KegowSpacer(width: Int) {
    Spacer(modifier = Modifier.width(width.dp))
}

@Composable
fun PetraOutlinedTextField(
    modifier: Modifier = Modifier,
    keyboardType: String? = "",
    value: String? = "",
    onTextChanged: (text: String) -> Unit = {},
    placeholderText: String = "",
    bottomPadding: Int = 15,
    isClickable: Boolean = true,
    isAccountNumber: Boolean = false,
    focusable: Boolean? = false,
    isValidationError: Boolean = false,
    isAmount: Boolean = false,
    imeAction: ImeAction = ImeAction.Next,
    textFieldColors: TextFieldColors = TextFieldDefaults.colors()
) {
    Box(
        modifier = modifier
            .padding(bottom = bottomPadding.dp)
            .focusable(enabled = focusable!!)
            .background(color = Color.Transparent)
    ) {
        when (keyboardType) {
            "number" -> {
                OutlinedTextField(
                    value = value ?: "",
                    onValueChange = { newValue ->
                        if (isAccountNumber) {
                            val trimmedValue = newValue.take(12)
                            onTextChanged(trimmedValue)
                        } else if (isAmount) {
                            if ((Regex("\\.").findAll(newValue).count() > 1).not()) {
                                onTextChanged(newValue)
                            }
                        } else {
                            onTextChanged(newValue)
                        }
                    },
                    placeholder = {
                        Text(
                            placeholderText,
                            fontSize = 14.sp
                        )
                    },
                    colors = textFieldColors,
                    visualTransformation = {
                        priceFilter(it, isAmount)
                    },
                    singleLine = true, isError = isValidationError,
                    enabled = isClickable,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number,
                        imeAction = imeAction
                    ),
                )
            }

            "number password" -> {
                OutlinedTextField(
                    value = value ?: "",
                    onValueChange = { newValue ->
                        if (isAccountNumber) {
                            val trimmedValue = newValue.take(12)
                            onTextChanged(trimmedValue)
                        } else if (isAmount) {
                            if ((Regex("\\.").findAll(newValue).count() > 1).not()) {
                                onTextChanged(newValue)
                            }
                        } else {
                            onTextChanged(newValue)
                        }
                    },
                    placeholder = {
                        Text(
                            placeholderText,
                            fontSize = 14.sp
                        )
                    },
                    enabled = isClickable,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),

                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.NumberPassword,
                        imeAction = imeAction
                    ),
                    isError = isValidationError,
                    colors = textFieldColors
                )
            }

            else -> {
                OutlinedTextField(
                    value = value ?: "",
                    onValueChange = { newValue ->
                        if (isAccountNumber) {
                            val trimmedValue = newValue.take(12)
                            onTextChanged(trimmedValue)
                        } else if (isAmount) {
                            if ((Regex("\\.").findAll(newValue).count() > 1).not()) {
                                onTextChanged(newValue)
                            }
                        } else {
                            onTextChanged(newValue)
                        }
                    },
                    placeholder = {
                        Text(
                            placeholderText,
                            fontSize = 14.sp
                        )
                    },
                    enabled = isClickable,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = imeAction
                    ),
                    isError = isValidationError,
                    colors = textFieldColors
                )
            }
        }
    }

}


@Composable
internal fun LoginScreenTextField(
//    phoneNumber: String,
    pin: String,
    email: String,
    onEmailTextChanged: (text: String) -> Unit,
    onPinTextChanged: (text: String) -> Unit,
//    phoneNumberError: String,
    passwordError: String,
//    onClickPhoneNumberTextField: () -> Unit,
    onClickedForgotPin: () -> Unit,
) {
    var passwordVisibility by rememberSaveable { mutableStateOf(true) }
    Column(
        modifier = Modifier.padding(top = 16.dp, bottom = 5.dp)
    ) {

        PetraOutlinedTextField(
            value = email,
            onTextChanged = onEmailTextChanged,
            placeholderText = "Email",
            textFieldColors = TextFieldDefaults.colors().copy(
                unfocusedContainerColor = Color.White,
                disabledTextColor = Color.Black,
            ),
            bottomPadding = 20
        )

        OutlinedTextField(
            value = pin,
            enabled = true,
            onValueChange = onPinTextChanged,
            placeholder = {
                Text(
                    "Password",
                    fontSize = 16.sp,
                )
            },
            shape = RoundedCornerShape(12),
            visualTransformation = if (passwordVisibility) PasswordVisualTransformation()
            else VisualTransformation.None,
//            leadingIcon = {
//                Icon(
//                    painter = painterResource(id = R.drawable.lock_icon_transparent),
//                    contentDescription = "Back button",
//                    tint = Color(0xFF000000),
//                    modifier = Modifier
//                        .size(22.dp)
//                )
//            },
            trailingIcon = {
                IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                    val imageVector: ImageVector =
                        if (passwordVisibility) Icons.Filled.VisibilityOff else Icons.Filled.Visibility

                    Icon(imageVector = imageVector, contentDescription = null)
                }
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            colors = TextFieldDefaults.colors().copy(
                unfocusedContainerColor = Color.White,
                disabledTextColor = Color.Black,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
//                .clickable { onClickPinTextField() }
        )
        if (passwordError.isNotEmpty()) {
            Text(
                text = passwordError,
                color = MaterialTheme.colorScheme.error,
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 2.dp)
            )
            KegowDivider(height = 16.0)
        }


    }

}

@Composable
fun PetraBottomButton(
    text: String,
    modifier: Modifier = Modifier,
    isLoading: Boolean = false,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(53.dp),
        onClick = { onClick() },
        enabled = enabled,

        colors = ButtonDefaults.buttonColors().copy(
            disabledContainerColor = Color(0xFFB2D5C7),
            disabledContentColor = Color(0xFFE6E6E6),
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.size(20.dp),
                color = MaterialTheme.colorScheme.onPrimary,
            )
        } else {
            Text(
                text = text,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}