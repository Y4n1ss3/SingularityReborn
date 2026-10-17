package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MenuOpenKt {
    private static ImageVector _menuOpen;

    public static final ImageVector getMenuOpen(Icons.Sharp sharp) {
        ImageVector imageVector = _menuOpen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MenuOpen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(3.0f, 18.0f, 13.0f, -2.0f, 3.0f);
        k4.D(d, 18.0f, 3.0f, 13.0f, 10.0f);
        gy.s(d, -2.0f, 3.0f, 13.0f);
        bv.y(d, 3.0f, 6.0f, 2.0f, 13.0f);
        bv.z(d, 6.0f, 3.0f, 21.0f, 15.59f);
        d.lineTo(17.42f, 12.0f);
        d.lineTo(21.0f, 8.41f);
        d.lineTo(19.59f, 7.0f);
        d.lineToRelative(-5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 5.0f, 5.0f, 21.0f, 15.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _menuOpen = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMenuOpen$annotations(Icons.Sharp sharp) {
    }
}
