fun main() {
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${calculateAuctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${calculateAuctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun calculateAuctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
