package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class EdgeEffectWrapper {
    private EdgeEffect bottomEffect;
    private EdgeEffect bottomEffectNegation;
    private final Context context;
    private final int glowColor;
    private EdgeEffect leftEffect;
    private EdgeEffect leftEffectNegation;
    private EdgeEffect rightEffect;
    private EdgeEffect rightEffectNegation;
    private long size = IntSize.Companion.m7787getZeroYbymL2g();
    private EdgeEffect topEffect;
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(Context context, int i) {
        this.context = context;
        this.glowColor = i;
    }

    private final EdgeEffect createEdgeEffect(Orientation orientation) {
        EdgeEffect create = EdgeEffectCompat.INSTANCE.create(this.context);
        create.setColor(this.glowColor);
        if (!IntSize.m7780equalsimpl0(this.size, IntSize.Companion.m7787getZeroYbymL2g())) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.size;
            if (orientation == orientation2) {
                create.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return create;
            }
            create.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return create;
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final void finishAll() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final void forEachEffect(ky kyVar) {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            kyVar.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            kyVar.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            kyVar.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            kyVar.invoke(edgeEffect4);
        }
    }

    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    /* renamed from: updateSize-ozmzZPI, reason: not valid java name */
    public final void m281updateSizeozmzZPI(long j) {
        this.size = j;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j >> 32), (int) (j & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j >> 32), (int) (j & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j & 4294967295L), (int) (j >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j & 4294967295L), (int) (j >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j >> 32), (int) (j & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j >> 32), (int) (j & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j & 4294967295L), (int) (j >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (j & 4294967295L), (int) (j >> 32));
        }
    }
}
