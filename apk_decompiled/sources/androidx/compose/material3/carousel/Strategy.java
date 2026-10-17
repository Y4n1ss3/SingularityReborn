package androidx.compose.material3.carousel;

import defpackage.aw;
import defpackage.bv;
import defpackage.dq;
import defpackage.q10;
import defpackage.ut;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Strategy {
    private static final Strategy Empty;
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final aw endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private List<KeylineList> lastStartAndEndKeylineListSteps;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final aw startShiftPoints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        KeylineList emptyKeylineList = KeylineListKt.emptyKeylineList();
        ut utVar = ut.d;
        Empty = new Strategy(emptyKeylineList, utVar, utVar, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f, float f2, float f3, float f4) {
        float startShiftDistance;
        float endShiftDistance;
        aw stepInterpolationPoints;
        aw stepInterpolationPoints2;
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f;
        this.itemSpacing = f2;
        this.beforeContentPadding = f3;
        this.afterContentPadding = f4;
        startShiftDistance = StrategyKt.getStartShiftDistance(list, f3);
        this.startShiftDistance = startShiftDistance;
        endShiftDistance = StrategyKt.getEndShiftDistance(list2, f4);
        this.endShiftDistance = endShiftDistance;
        stepInterpolationPoints = StrategyKt.getStepInterpolationPoints(startShiftDistance, list, true);
        this.startShiftPoints = stepInterpolationPoints;
        stepInterpolationPoints2 = StrategyKt.getStepInterpolationPoints(endShiftDistance, list2, false);
        this.endShiftPoints = stepInterpolationPoints2;
        this.isValid = (keylineList.isEmpty() || f == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3$default(Strategy strategy, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return strategy.getKeylineListForScrollOffset$material3(f, f2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z = this.isValid;
        if (!z && !((Strategy) obj).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && q10.b(this.startShiftPoints, strategy.startShiftPoints) && q10.b(this.endShiftPoints, strategy.endShiftPoints) && q10.b(this.defaultKeylines, strategy.defaultKeylines);
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KeylineList getKeylineListForScrollOffset$material3(float f, float f2, boolean z) {
        float lerp;
        ShiftPointRange shiftPointRange;
        float max = Math.max(0.0f, f);
        float f3 = this.startShiftDistance;
        float max2 = Math.max(0.0f, f2 - this.endShiftDistance);
        if (f3 <= max && max <= max2) {
            return this.defaultKeylines;
        }
        lerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f3, max);
        aw awVar = this.startShiftPoints;
        List<KeylineList> list = this.startKeylineSteps;
        if (max > max2) {
            lerp = StrategyKt.lerp(0.0f, 1.0f, max2, f2, max);
            awVar = this.endShiftPoints;
            list = this.endKeylineSteps;
            if (max2 < 0.01f && this.startKeylineSteps.size() == 2 && this.endKeylineSteps.size() == 2) {
                List<KeylineList> list2 = this.lastStartAndEndKeylineListSteps;
                if (list2 == null) {
                    list2 = y80.E(yi.v0(this.startKeylineSteps), yi.v0(this.endKeylineSteps));
                    this.lastStartAndEndKeylineListSteps = list2;
                }
                list = list2;
                list.getClass();
            }
        }
        shiftPointRange = StrategyKt.getShiftPointRange(list.size(), awVar, lerp);
        if (z) {
            return list.get(y80.P(shiftPointRange.getSteppedInterpolation()) == 0 ? shiftPointRange.getFromStepIndex() : shiftPointRange.getToStepIndex());
        }
        return KeylineListKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public int hashCode() {
        boolean z = this.isValid;
        if (!z) {
            return Boolean.hashCode(z);
        }
        return this.defaultKeylines.hashCode() + ((this.endShiftPoints.hashCode() + ((this.startShiftPoints.hashCode() + bv.a(this.endShiftDistance, bv.a(this.startShiftDistance, (Float.hashCode(getItemMainAxisSize()) + bv.a(this.afterContentPadding, bv.a(this.beforeContentPadding, bv.a(this.itemSpacing, bv.a(this.availableSpace, Boolean.hashCode(z) * 31, 31), 31), 31), 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Strategy getEmpty() {
            return Strategy.Empty;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Strategy(KeylineList keylineList, float f, float f2, float f3, float f4) {
        this(keylineList, r2, r3, f, f2, f3, f4);
        List startKeylineSteps;
        List endKeylineSteps;
        startKeylineSteps = StrategyKt.getStartKeylineSteps(keylineList, f, f2, f3);
        endKeylineSteps = StrategyKt.getEndKeylineSteps(keylineList, f, f2, f4);
    }
}
