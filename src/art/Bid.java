package src.art;

// <div activity-item="" class="message ng-binding">10538 a oferit €1,200.</div>
public class Bid {
    private final Bidder bidder; // 10538
    private final int offer; //1,200

    public Bid(final Bidder bidder, final int offer) {
        this.bidder = bidder;
        this.offer = offer;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public int getOffer() {
        return offer;
    }
}
