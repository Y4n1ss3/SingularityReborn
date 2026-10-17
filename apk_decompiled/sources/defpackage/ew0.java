package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.WideNavigationRailState;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.material3.WideNavigationRailValue;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ew0 implements my {
    public final /* synthetic */ int d;

    public /* synthetic */ ew0(int i) {
        this.d = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        List Saver$lambda$0;
        WideNavigationRailValue Saver$lambda$02;
        int top;
        int bottom;
        switch (this.d) {
            case 0:
                Saver$lambda$0 = TopAppBarState.Saver$lambda$0((SaverScope) obj, (TopAppBarState) obj2);
                return Saver$lambda$0;
            case 1:
                Saver$lambda$02 = WideNavigationRailStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (WideNavigationRailState) obj2);
                return Saver$lambda$02;
            case 2:
                top = ((WindowInsets) obj).getTop((Density) obj2);
                return Integer.valueOf(top);
            default:
                bottom = ((WindowInsets) obj).getBottom((Density) obj2);
                return Integer.valueOf(bottom);
        }
    }
}
