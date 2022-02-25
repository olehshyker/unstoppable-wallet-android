package io.horizontalsystems.bankwallet.modules.nft

import androidx.room.Embedded
import androidx.room.Entity
import java.math.BigDecimal

@Entity(primaryKeys = ["accountId", "uid"])
data class NftCollectionRecord(
    val accountId: String,
    val uid: String,
    val name: String,
    val imageUrl: String?,

    @Embedded
    val stats: NftCollectionStats?
)

data class NftCollectionStats(
    val averagePrice7d: BigDecimal,
    val averagePrice30d: BigDecimal,
)
