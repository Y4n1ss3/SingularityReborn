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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WineBarKt {
    private static ImageVector _wineBar;

    public static final ImageVector getWineBar(Icons.Outlined outlined) {
        ImageVector imageVector = _wineBar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WineBar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.0f, 3.0f, 0.0f, 6.0f);
        e.curveToRelative(0.0f, 2.97f, 2.16f, 5.43f, 5.0f, 5.91f);
        bv.A(e, 19.0f, 8.0f, 2.0f, 8.0f);
        kf0.z(e, -2.0f, -3.0f, -4.09f);
        e.curveToRelative(2.84f, -0.48f, 5.0f, -2.94f, 5.0f, -5.91f);
        bv.z(e, 3.0f, 6.0f, 12.0f, 13.0f);
        e.curveToRelative(-1.86f, 0.0f, -3.41f, -1.28f, -3.86f, -3.0f);
        e.horizontalLineToRelative(7.72f);
        e.curveTo(15.41f, 11.72f, 13.86f, 13.0f, 12.0f, 13.0f);
        r6.g(e, 16.0f, 8.0f, 8.0f);
        e.lineToRelative(0.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(e, 8.0f, 16.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wineBar = build;
        build.getClass();
        return build;
    }
}
