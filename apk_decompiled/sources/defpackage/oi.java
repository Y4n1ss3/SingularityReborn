package defpackage;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.CustomAppBarItem;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oi(int i, String str) {
        this.d = 9;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 AppbarContent$lambda$0;
        w01 TextFieldCursorHandle$lambda$4;
        w01 AppbarContent$lambda$02;
        w01 run$lambda$2;
        w01 LazySaveableStateHolderProvider$lambda$2;
        w01 Item$lambda$0;
        w01 ActiveIcon$lambda$1;
        w01 LinksComposables$lambda$1;
        w01 AppbarContent$lambda$03;
        int i = this.d;
        Object obj3 = this.f;
        int i2 = this.e;
        switch (i) {
            case 0:
                AppbarContent$lambda$0 = ClickableAppBarItem.AppbarContent$lambda$0((ClickableAppBarItem) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return AppbarContent$lambda$0;
            case 1:
                TextFieldCursorHandle$lambda$4 = CoreTextFieldKt.TextFieldCursorHandle$lambda$4((TextFieldSelectionManager) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return TextFieldCursorHandle$lambda$4;
            case 2:
                AppbarContent$lambda$02 = CustomAppBarItem.AppbarContent$lambda$0((CustomAppBarItem) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return AppbarContent$lambda$02;
            case 3:
                run$lambda$2 = InfiniteTransition.run$lambda$2((InfiniteTransition) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return run$lambda$2;
            case 4:
                LazySaveableStateHolderProvider$lambda$2 = LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$2((ny) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return LazySaveableStateHolderProvider$lambda$2;
            case 5:
                Item$lambda$0 = PagerLazyLayoutItemProvider.Item$lambda$0((PagerLazyLayoutItemProvider) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Item$lambda$0;
            case 6:
                ActiveIcon$lambda$1 = SegmentedButtonDefaults.ActiveIcon$lambda$1((SegmentedButtonDefaults) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return ActiveIcon$lambda$1;
            case 7:
                LinksComposables$lambda$1 = TextLinkScope.LinksComposables$lambda$1((TextLinkScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return LinksComposables$lambda$1;
            case 8:
                AppbarContent$lambda$03 = ToggleableAppBarItem.AppbarContent$lambda$0((ToggleableAppBarItem) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return AppbarContent$lambda$03;
            default:
                String str = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2095257906, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2294)");
                    }
                    TextKt.m2607TextNvy7gAk(i2 + " " + str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01.a;
        }
    }

    public /* synthetic */ oi(Object obj, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = i;
    }
}
