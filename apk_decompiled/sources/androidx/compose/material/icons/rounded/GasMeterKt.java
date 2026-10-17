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
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GasMeterKt {
    private static ImageVector _gasMeter;

    public static final ImageVector getGasMeter(Icons.Rounded rounded) {
        ImageVector imageVector = _gasMeter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GasMeter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(16.0f, 4.0f, -1.0f, 3.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        bv.x(e, 1.0f, -2.0f, 3.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineTo(8.0f);
        e.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        e.verticalLineToRelative(10.0f);
        e.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        e.verticalLineTo(8.0f);
        e.curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f);
        e.close();
        e.moveTo(12.0f, 18.0f);
        e.curveToRelative(-1.38f, 0.0f, -2.5f, -1.1f, -2.5f, -2.46f);
        e.curveToRelative(0.0f, -1.02f, 0.38f, -1.35f, 2.12f, -3.35f);
        e.curveToRelative(0.2f, -0.23f, 0.56f, -0.23f, 0.75f, 0.0f);
        e.curveToRelative(1.73f, 1.99f, 2.12f, 2.34f, 2.12f, 3.35f);
        e.curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f);
        r6.g(e, 15.0f, 10.0f, 9.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(6.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gasMeter = build;
        build.getClass();
        return build;
    }
}
