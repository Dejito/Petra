package com.mobile.petra.presentation.views.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PetraAppBar(
    enabledBackButton:Boolean=true,
    title: String, elevation: Int = 5,
    backgroundColor: Color = Color.White,
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
                title, textAlign = TextAlign.Center,
                color = textColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = padding.dp)
            )
        },
        navigationIcon = {
            if(enabledBackButton)IconButton(onClick = { onClick() }) {
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
    maxLines:Int = 1,
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