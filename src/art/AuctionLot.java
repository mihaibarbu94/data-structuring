package src.art;

import java.util.List;
import java.util.Set;

public class AuctionLot {

    private final Auction auction;
    private final int lotNumber;
    private final String lotName;
    private final List<Bid> bids;
    private final Set<Bidder> lotBidders;
    private final PriceInfo priceInfo;;
    private final Bidder lotWinner;

    public AuctionLot(final Auction auction,
                      final int lotNumber,
                      final String lotName,
                      final List<Bid> bids,
                      final Set<Bidder> lotBidders,
                      final PriceInfo priceInfo,
                      final Bidder lotWinner) {
        this.auction = auction;
        this.lotNumber = lotNumber;
        this.lotName = lotName;
        this.bids = bids;
        this.lotBidders = lotBidders;
        this.priceInfo = priceInfo;
        this.lotWinner = lotWinner;
    }

    public AuctionLot(final int lotNumber,
                      final List<Bid> bids,
                      final Set<Bidder> lotBidders,
                      final PriceInfo priceInfo,
                      final Bidder lotWinner) {
        this.auction = new Auction();
        this.lotNumber = lotNumber;
        this.lotName = "N/A";
        this.bids = bids;
        this.lotBidders = lotBidders;
        this.priceInfo = priceInfo;
        this.lotWinner = lotWinner;
    }
}
