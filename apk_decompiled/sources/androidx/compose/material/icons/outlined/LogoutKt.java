package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LogoutKt {
    private static ImageVector _logout;

    public static final ImageVector getLogout(Icons.Outlined outlined) {
        ImageVector imageVector = _logout;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Logout", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 8.0f, -1.41f, 1.41f);
        r6.w(e, 17.17f, 11.0f, 9.0f, 2.0f);
        e.horizontalLineToRelative(8.17f);
        e.lineToRelative(-1.58f, 1.58f);
        e.lineTo(17.0f, 16.0f);
        gy.B(e, 4.0f, -4.0f, 17.0f, 8.0f);
        j50.y(e, 5.0f, 5.0f, 7.0f, 3.0f);
        e.horizontalLineTo(5.0f);
        e.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        e.verticalLineToRelative(14.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(e, 7.0f, -2.0f, 5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _logout = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLogout$annotations(Icons.Outlined outlined) {
    }
}
