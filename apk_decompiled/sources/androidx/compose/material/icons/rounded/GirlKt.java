package androidx.compose.material.icons.rounded;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GirlKt {
    private static ImageVector _girl;

    public static final ImageVector getGirl(Icons.Rounded rounded) {
        ImageVector imageVector = _girl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Girl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.5f);
        b.curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f);
        b.reflectiveCurveTo(12.97f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(-1.75f, 0.78f, -1.75f, 1.75f);
        b.reflectiveCurveTo(11.03f, 7.5f, 12.0f, 7.5f);
        bv.v(b, 14.0f, 16.0f, 3.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-3.0f);
        b.horizontalLineTo(9.44f);
        b.curveToRelative(-0.7f, 0.0f, -1.18f, -0.7f, -0.94f, -1.35f);
        b.lineToRelative(1.88f, -5.03f);
        b.curveTo(10.63f, 8.95f, 11.28f, 8.5f, 12.0f, 8.5f);
        b.reflectiveCurveToRelative(1.37f, 0.45f, 1.62f, 1.12f);
        b.lineToRelative(1.88f, 5.03f);
        b.curveTo(15.74f, 15.3f, 15.26f, 16.0f, 14.56f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _girl = build;
        build.getClass();
        return build;
    }
}
