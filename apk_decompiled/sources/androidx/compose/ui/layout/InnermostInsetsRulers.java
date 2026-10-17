package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;
import defpackage.ac;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class InnermostInsetsRulers implements WindowInsetsRulers {
    private final RectRulers current;
    private final RectRulers maximum;
    private final String name;
    private final WindowInsetsRulers[] rulers;

    public InnermostInsetsRulers(String str, WindowInsetsRulers[] windowInsetsRulersArr) {
        this.name = str;
        this.rulers = windowInsetsRulersArr;
        RectRulers.Companion companion = RectRulers.Companion;
        ArrayList arrayList = new ArrayList(windowInsetsRulersArr.length);
        for (WindowInsetsRulers windowInsetsRulers : windowInsetsRulersArr) {
            arrayList.add(windowInsetsRulers.getCurrent());
        }
        RectRulers[] rectRulersArr = (RectRulers[]) arrayList.toArray(new RectRulers[0]);
        this.current = RectRulersKt.innermostOf(companion, (RectRulers[]) Arrays.copyOf(rectRulersArr, rectRulersArr.length));
        RectRulers.Companion companion2 = RectRulers.Companion;
        WindowInsetsRulers[] windowInsetsRulersArr2 = this.rulers;
        ArrayList arrayList2 = new ArrayList(windowInsetsRulersArr2.length);
        for (WindowInsetsRulers windowInsetsRulers2 : windowInsetsRulersArr2) {
            arrayList2.add(windowInsetsRulers2.getMaximum());
        }
        RectRulers[] rectRulersArr2 = (RectRulers[]) arrayList2.toArray(new RectRulers[0]);
        this.maximum = RectRulersKt.innermostOf(companion2, (RectRulers[]) Arrays.copyOf(rectRulersArr2, rectRulersArr2.length));
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public WindowInsetsAnimation getAnimation(Placeable.PlacementScope placementScope) {
        return new InnermostAnimationProperties(placementScope, this.rulers);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getMaximum() {
        return this.maximum;
    }

    public final String getName() {
        return this.name;
    }

    public final WindowInsetsRulers[] getRulers() {
        return this.rulers;
    }

    public String toString() {
        String str = this.name;
        return str == null ? ac.h0("innermostOf(", this.rulers) : str;
    }
}
