package androidx.compose.material.icons.filled;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpAltKt {
    private static ImageVector _thumbUpAlt;

    public static final ImageVector getThumbUpAlt(Icons.Filled filled) {
        ImageVector imageVector = _thumbUpAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbUpAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(2.0f, 20.0f, 2.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-9.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        bv.r(a, 2.0f, 9.0f, 11.0f);
        a.moveTo(21.83f, 12.88f);
        a.curveToRelative(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f);
        a.lineTo(22.0f, 11.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineToRelative(-5.5f);
        a.lineToRelative(0.92f, -4.65f);
        a.curveToRelative(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f);
        a.curveToRelative(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f);
        a.lineTo(14.0f, 2.0f);
        a.lineTo(7.59f, 8.41f);
        a.curveTo(7.21f, 8.79f, 7.0f, 9.3f, 7.0f, 9.83f);
        a.verticalLineToRelative(7.84f);
        a.curveTo(7.0f, 18.95f, 8.05f, 20.0f, 9.34f, 20.0f);
        a.horizontalLineToRelative(8.11f);
        a.curveToRelative(0.7f, 0.0f, 1.36f, -0.37f, 1.72f, -0.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(a, 2.66f, -6.15f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpAlt = build;
        build.getClass();
        return build;
    }
}
