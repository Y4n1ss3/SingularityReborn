package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.aw;
import defpackage.bw;
import defpackage.d10;
import defpackage.ga0;
import defpackage.j10;
import defpackage.k10;
import defpackage.ka0;
import defpackage.ky;
import defpackage.ut;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrategyKt {
    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList keylineList, float f, float f2, float f3, Keyline keyline, int i) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keyline keyline2 = keylineList.get(i2);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f3 / arrayList.size();
        KeylineList keylineListOf = KeylineListKt.keylineListOf(f, f2, i, (keyline.getOffset() - (size2 / 2.0f)) + f3, new ky() { // from class: bs0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 createShiftedKeylineListForContentPadding$lambda$2;
                createShiftedKeylineListForContentPadding$lambda$2 = StrategyKt.createShiftedKeylineListForContentPadding$lambda$2(KeylineList.this, size2, (KeylineListScope) obj);
                return createShiftedKeylineListForContentPadding$lambda$2;
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListOf.size());
        int size3 = keylineListOf.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(Keyline.copy$default(keylineListOf.get(i3), 0.0f, 0.0f, keylineList.get(i3).getUnadjustedOffset(), false, false, false, 0.0f, 123, null));
        }
        return new KeylineList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 createShiftedKeylineListForContentPadding$lambda$2(KeylineList keylineList, float f, KeylineListScope keylineListScope) {
        int size = keylineList.size();
        for (int i = 0; i < size; i++) {
            Keyline keyline = keylineList.get(i);
            keylineListScope.add(keyline.getSize() - Math.abs(f), keyline.isAnchor());
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f, float f2, float f3) {
        if (keylineList.isEmpty()) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isLastFocalItemAtEndOfContainer(f)) {
            if (f3 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f, f2, -f3, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i = lastNonAnchorIndex - lastFocalIndex;
        if (i <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f, f2));
            return arrayList;
        }
        for (int i2 = 0; i2 < i; i2++) {
            KeylineList keylineList2 = (KeylineList) yi.v0(arrayList);
            int i3 = lastNonAnchorIndex - i2;
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i3 < keylineList.size() + (-1) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i3 + 1).getSize()) + 1 : 0, f, f2));
        }
        if (f3 == 0.0f) {
            return arrayList;
        }
        arrayList.set(arrayList.size() - 1, createShiftedKeylineListForContentPadding((KeylineList) yi.v0(arrayList), f, f2, -f3, ((KeylineList) yi.v0(arrayList)).getLastFocal(), ((KeylineList) yi.v0(arrayList)).getLastFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getEndShiftDistance(List<KeylineList> list, float f) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) yi.v0((List) yi.p0(list))).getUnadjustedOffset() - ((Keyline) yi.v0((List) yi.v0(list))).getUnadjustedOffset(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShiftPointRange getShiftPointRange(int i, aw awVar, float f) {
        float a = awVar.a(0);
        Iterator it = y80.W(1, i).iterator();
        while (it.hasNext()) {
            int nextInt = ((d10) it).nextInt();
            float a2 = awVar.a(nextInt);
            if (f <= a2) {
                return new ShiftPointRange(nextInt - 1, nextInt, lerp(0.0f, 1.0f, a, a2, f));
            }
            a = a2;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f, float f2, float f3) {
        if (keylineList.isEmpty()) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isFirstFocalItemAtStartOfContainer()) {
            if (f3 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f, f2, f3, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f, f2));
            return arrayList;
        }
        for (int i = 0; i < firstFocalIndex; i++) {
            KeylineList keylineList2 = (KeylineList) yi.v0(arrayList);
            int i2 = firstNonAnchorIndex + i;
            int size = keylineList.size() - 1;
            if (i2 > 0) {
                size = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i2 - 1).getSize()) - 1;
            }
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), size, f, f2));
        }
        if (f3 == 0.0f) {
            return arrayList;
        }
        arrayList.set(arrayList.size() - 1, createShiftedKeylineListForContentPadding((KeylineList) yi.v0(arrayList), f, f2, f3, ((KeylineList) yi.v0(arrayList)).getFirstFocal(), ((KeylineList) yi.v0(arrayList)).getFirstFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStartShiftDistance(List<KeylineList> list, float f) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) yi.p0((List) yi.v0(list))).getUnadjustedOffset() - ((Keyline) yi.p0((List) yi.p0(list))).getUnadjustedOffset(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aw getStepInterpolationPoints(float f, List<KeylineList> list, boolean z) {
        int i = bw.a;
        ka0 ka0Var = new ka0();
        ka0Var.a = new float[1];
        ka0Var.b(0.0f);
        if (f != 0.0f && !list.isEmpty()) {
            k10 W = y80.W(1, list.size());
            ArrayList arrayList = new ArrayList(zi.a0(W, 10));
            Iterator it = W.iterator();
            while (((j10) it).f) {
                int nextInt = ((d10) it).nextInt();
                int i2 = nextInt - 1;
                KeylineList keylineList = list.get(i2);
                KeylineList keylineList2 = list.get(nextInt);
                ka0Var.b(nextInt == list.size() - 1 ? 1.0f : ka0Var.a(i2) + ((z ? ((Keyline) yi.p0(keylineList2)).getUnadjustedOffset() - ((Keyline) yi.p0(keylineList)).getUnadjustedOffset() : ((Keyline) yi.v0(keylineList)).getUnadjustedOffset() - ((Keyline) yi.v0(keylineList2)).getUnadjustedOffset()) / f));
                arrayList.add(Boolean.TRUE);
            }
        }
        return ka0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : MathHelpersKt.lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    private static final List<Keyline> move(List<Keyline> list, int i, int i2) {
        Keyline keyline = list.get(i);
        list.remove(i);
        list.add(i2, keyline);
        return list;
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(KeylineList keylineList, int i, int i2, float f, float f2) {
        int i3 = 1;
        int i4 = i > i2 ? 1 : -1;
        return KeylineListKt.keylineListOf(f, f2, keylineList.getPivotIndex() + i4, keylineList.getPivot().getOffset() + (((keylineList.get(i).getSize() - keylineList.get(i).getCutoff()) + f2) * i4), new ga0(i, i2, i3, keylineList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 moveKeylineAndCreateShiftedKeylineList$lambda$5(KeylineList keylineList, int i, int i2, KeylineListScope keylineListScope) {
        List<Keyline> move = move(yi.J0(keylineList), i, i2);
        int size = move.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline = move.get(i3);
            keylineListScope.add(keyline.getSize(), keyline.isAnchor());
        }
        return w01.a;
    }
}
