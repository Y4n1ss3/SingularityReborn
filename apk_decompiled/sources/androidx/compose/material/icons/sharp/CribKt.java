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
import defpackage.c21;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.Sharp sharp) {
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Crib", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(20.0f, 9.0f, -8.0f, 4.0f, 8.0f);
        v.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        kf0.z(v, 8.0f, 4.0f, 2.93f);
        v.curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f);
        v.lineToRelative(-1.42f, 1.42f);
        v.curveTo(6.74f, 20.88f, 9.24f, 22.0f, 12.0f, 22.0f);
        v.curveToRelative(2.76f, 0.0f, 5.26f, -1.12f, 7.07f, -2.93f);
        v.lineToRelative(-1.42f, -1.42f);
        v.curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f);
        c21.c(v, 16.0f, 4.0f, 9.0f);
        v.moveTo(14.0f, 19.75f);
        v.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        v.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(v, 16.0f, 4.0f, 19.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = build;
        build.getClass();
        return build;
    }
}
