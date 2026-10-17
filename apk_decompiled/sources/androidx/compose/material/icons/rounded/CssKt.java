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
import defpackage.af0;
import defpackage.bv;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CssKt {
    private static ImageVector _css;

    public static final ImageVector getCss(Icons.Rounded rounded) {
        ImageVector imageVector = _css;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Css", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 10.25f);
        b.curveTo(8.0f, 10.66f, 7.66f, 11.0f, 7.25f, 11.0f);
        b.curveToRelative(-0.33f, 0.0f, -0.6f, -0.21f, -0.71f, -0.5f);
        b.lineToRelative(-2.04f, 0.0f);
        b.verticalLineToRelative(3.0f);
        b.lineToRelative(2.04f, 0.0f);
        b.curveToRelative(0.1f, -0.29f, 0.38f, -0.5f, 0.71f, -0.5f);
        b.curveTo(7.66f, 13.0f, 8.0f, 13.34f, 8.0f, 13.75f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(b, 10.25f, 13.04f, 10.5f);
        b.curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.5f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uf.k(b, 13.0f, 1.0f, -2.04f, 0.0f);
        b.curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(11.0f);
        b.verticalLineToRelative(-1.0f);
        b.lineTo(13.04f, 10.5f);
        b.close();
        b.moveTo(19.54f, 10.5f);
        b.curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.5f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        af0.v(b, 2.5f, 1.0f, -2.04f, 0.0f);
        b.curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f);
        b.curveTo(16.34f, 13.0f, 16.0f, 13.34f, 16.0f, 13.75f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(b, -2.5f, -1.0f, 19.54f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _css = build;
        build.getClass();
        return build;
    }
}
