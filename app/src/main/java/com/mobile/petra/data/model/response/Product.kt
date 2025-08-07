import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Product(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("slug")
    val slug: String,
    @SerialName("price")
    val price: Double,
    @SerialName("description")
    val description: String,
    @SerialName("category")
    val category: Category,
    @SerialName("images")
    val images: List<String>,
    @SerialName("isFavorite")
    val isFavorite: Boolean,
)

@Serializable
data class Category(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("image")
    val image: String,
    @SerialName("slug")
    val slug: String,
)