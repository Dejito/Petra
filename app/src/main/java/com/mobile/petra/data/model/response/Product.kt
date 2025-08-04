import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ProductResponse(
    @SerialName("products")
    val products: List<Product> = emptyList(),
    @SerialName("total")
    val total: Int = 0,
    @SerialName("skip")
    val skip: Int = 0,
    @SerialName("limit")
    val limit: Int = 0
)

@Serializable
data class Product(
    @SerialName("id")
    val id: Int = 0,
    @SerialName("title")
    val title: String = "",
    @SerialName("description")
    val description: String = "",
    @SerialName("category")
    val category: String = "",
    @SerialName("price")
    val price: Double = 0.0,
    @SerialName("discountPercentage")
    val discountPercentage: Double = 0.0,
    @SerialName("rating")
    val rating: Double = 0.0,
    @SerialName("stock")
    val stock: Int = 0,
    @SerialName("tags")
    val tags: List<String> = emptyList(),
    @SerialName("brand")
    val brand: String = "",
    @SerialName("sku")
    val sku: String = "",
    @SerialName("weight")
    val weight: Int = 0,
    @SerialName("dimensions")
    val dimensions: Dimensions = Dimensions(),
    @SerialName("warrantyInformation")
    val warrantyInformation: String = "",
    @SerialName("shippingInformation")
    val shippingInformation: String = "",
    @SerialName("availabilityStatus")
    val availabilityStatus: String = "",
    @SerialName("reviews")
    val reviews: List<Review> = emptyList(),
    @SerialName("returnPolicy")
    val returnPolicy: String = "",
    @SerialName("minimumOrderQuantity")
    val minimumOrderQuantity: Int = 0,
    @SerialName("meta")
    val meta: Meta = Meta(),
    @SerialName("thumbnail")
    val thumbnail: String = "",
    @SerialName("images")
    val images: List<String> = emptyList()
)

@Serializable
data class Dimensions(
    @SerialName("width")
    val width: Double = 0.0,
    @SerialName("height")
    val height: Double = 0.0,
    @SerialName("depth")
    val depth: Double = 0.0
)

@Serializable
data class Review(
    @SerialName("rating")
    val rating: Int = 0,
    @SerialName("comment")
    val comment: String = "",
    @SerialName("date")
    val date: String = "",
    @SerialName("reviewerName")
    val reviewerName: String = "",
    @SerialName("reviewerEmail")
    val reviewerEmail: String = ""
)

@Serializable
data class Meta(
    @SerialName("createdAt")
    val createdAt: String = "",
    @SerialName("updatedAt")
    val updatedAt: String = "",
    @SerialName("barcode")
    val barcode: String = "",
    @SerialName("qrCode")
    val qrCode: String = ""
)
