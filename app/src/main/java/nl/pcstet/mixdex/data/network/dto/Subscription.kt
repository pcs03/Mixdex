package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Subscription(
    val type: String,
    @SerialName("paddle_id")
    val paddleId: String,
    val status: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("updated_at")
    val updatedAt: String,
    @SerialName("paused_at")
    val pausedAt: String,
    @SerialName("ends_at")
    val endsAt: String,
    @SerialName("past_due")
    val pastDue: Boolean,
    @SerialName("is_recurring")
    val isRecurring: Boolean,
    @SerialName("update_payment_url")
    val updatePaymentUrl: String,
    @SerialName("cancel_url")
    val cancelUrl: String,
    @SerialName("next_billed_at")
    val nextBilledAt: SubscriptionNextBilled? = null,
    val transactions: List<SubscriptionTransaction> = emptyList()
)

@Serializable
data class SubscriptionNextBilled(
    val currency: String,
    val amount: String,
    val date: String
)

@Serializable
data class SubscriptionTransaction(
    val total: String,
    val tax: String,
    val currency: String,
    val status: String,
    @SerialName("invoice_number")
    val invoiceNumber: String,
    val url: String,
    @SerialName("billed_at")
    val billedAt: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("updated_at")
    val updatedAt: String? = null
)
