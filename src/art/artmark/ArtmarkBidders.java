package src.art.artmark;

import src.art.Bidder;

import java.util.HashSet;
import java.util.Set;

public class ArtmarkBidders {
    private static ArtmarkBidders singleInstanceArtmarkBidders = null;
    private Set<Bidder> bidders = new HashSet<>();

    public void updateBiddersSet(final Bidder bidder) {
        bidders.add(bidder);
    }

    private ArtmarkBidders() {
    }

    public static ArtmarkBidders getInstance() {
        if (singleInstanceArtmarkBidders == null)
            singleInstanceArtmarkBidders = new ArtmarkBidders();

        return singleInstanceArtmarkBidders;
    }

    public Set<Bidder> getBidders() {
        return bidders;
    }

    public boolean containsBidder(final Bidder bidder) {
        return bidders.contains(bidder);
    }

    public int getCount() {
        return bidders.size();
    }
}
