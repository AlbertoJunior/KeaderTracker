package dev.keader.correiostracker.view.adapters

import dev.keader.correiostracker.R
import timber.log.Timber

@Suppress("unused")
enum class CorreiosResourceStatus(
    val statusString: String,
    val iconRes: Int,
    val bgColorRes: Int,
    val titleColorRes: Int,
    val codeColorRes: Int
) {
    POSTED(
        statusString = "Objeto postado",
        iconRes = R.drawable.ic_h_post,
        bgColorRes = R.color.bg_posted,
        titleColorRes = R.color.title_posted,
        codeColorRes = R.color.code_posted,
    ),
    MOVING(
        statusString = "Objeto em trânsito - por favor aguarde",
        iconRes = R.drawable.ic_moving,
        bgColorRes = R.color.bg_moving,
        titleColorRes = R.color.title_moving,
        codeColorRes = R.color.code_moving,
    ),
    ARRIVED(
        statusString = "Objeto recebido pelos Correios do Brasil",
        iconRes = R.drawable.ic_arrived,
        bgColorRes = R.color.bg_arrived,
        titleColorRes = R.color.title_arrived,
        codeColorRes = R.color.code_arrived,
    ),
    INSPECTION(
        statusString = "Encaminhado para fiscalização aduaneira",
        iconRes = R.drawable.ic_inspection,
        bgColorRes = R.color.bg_inspection,
        titleColorRes = R.color.title_inspection,
        codeColorRes = R.color.code_inspection,
    ),
    WAITING_PAYMENT(
        statusString = "Aguardando pagamento",
        iconRes = R.drawable.ic_block,
        bgColorRes = R.color.bg_waiting_payment,
        titleColorRes = R.color.title_waiting_payment,
        codeColorRes = R.color.code_waiting_payment,
    ),
    PAYMENT(
        statusString = "Pagamento confirmado",
        iconRes = R.drawable.ic_pay,
        bgColorRes = R.color.bg_payment,
        titleColorRes = R.color.title_payment,
        codeColorRes = R.color.code_payment,
    ),
    INSPECTION_FINISHED(
        statusString = "Fiscalização aduaneira finalizada",
        iconRes = R.drawable.ic_inspection_ok,
        bgColorRes = R.color.bg_inspection_ok,
        titleColorRes = R.color.title_inspection_ok,
        codeColorRes = R.color.code_inspection_ok,
    ),
    DELIVERY_IN_PROGRESS(
        statusString = "Objeto saiu para entrega ao destinatário",
        iconRes = R.drawable.ic_delivery_in_progress,
        bgColorRes = R.color.bg_delivery_in_progress,
        titleColorRes = R.color.title_delivery_in_progress,
        codeColorRes = R.color.code_delivery_in_progress,
    ),
    WAITING_POST(
        statusString = "Aguardando postagem pelo remetente",
        iconRes = R.drawable.ic_waiting_post,
        bgColorRes = R.color.bg_waiting_post,
        titleColorRes = R.color.title_waiting_post,
        codeColorRes = R.color.code_waiting_post,
    ),
    WAITING_POST_OLD(
        statusString = "Aguardando postagem pelo remetente.",
        iconRes = R.drawable.ic_waiting_post,
        bgColorRes = R.color.bg_waiting_post,
        titleColorRes = R.color.title_waiting_post,
        codeColorRes = R.color.code_waiting_post,
    ),
    DELIVERED(
        statusString = "Objeto entregue ao destinatário",
        iconRes = R.drawable.ic_delivered,
        bgColorRes = R.color.bg_delivered,
        titleColorRes = R.color.title_delivered,
        codeColorRes = R.color.code_delivered,
    ),
    BROKEN(
        statusString = "Objeto recebido pelos Correios do Brasil com embalagem danificada",
        iconRes = R.drawable.ic_broken_box,
        bgColorRes = R.color.bg_waiting_payment,
        titleColorRes = R.color.title_waiting_payment,
        codeColorRes = R.color.code_waiting_payment,
    ),
    POSTED_DELAYED(
        statusString = "Objeto postado após o horário limite da unidade",
        iconRes = R.drawable.ic_h_post,
        bgColorRes = R.color.bg_posted,
        titleColorRes = R.color.title_posted,
        codeColorRes = R.color.code_posted,
    ),
    UNKNOWN(
        statusString = "",
        iconRes = R.drawable.ic_moving,
        bgColorRes = R.color.bg_unk,
        titleColorRes = R.color.title_unk,
        codeColorRes = R.color.code_unk,
    );

    companion object {
        private val map = values().associateBy(CorreiosResourceStatus::statusString)
        fun getResourceStatus(status: String): CorreiosResourceStatus {
            val obj = map[status]
            if (obj != null)
                return obj

            Timber.e("Unknown Status: $status")
            return UNKNOWN
        }
    }
}
