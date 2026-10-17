package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface NavigationDrawerItemColors {
    State<Color> badgeColor(boolean z, Composer composer, int i);

    State<Color> containerColor(boolean z, Composer composer, int i);

    State<Color> iconColor(boolean z, Composer composer, int i);

    State<Color> textColor(boolean z, Composer composer, int i);
}
