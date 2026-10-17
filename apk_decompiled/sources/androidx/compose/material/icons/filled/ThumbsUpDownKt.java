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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Filled filled) {
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbsUpDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(5.82f, 5.0f);
        b.lineToRelative(0.66f, -3.18f);
        b.lineToRelative(0.02f, -0.23f);
        b.curveToRelative(0.0f, -0.31f, -0.13f, -0.59f, -0.33f, -0.8f);
        b.lineTo(5.38f, 0.0f);
        b.lineTo(0.44f, 4.94f);
        b.curveTo(0.17f, 5.21f, 0.0f, 5.59f, 0.0f, 6.0f);
        b.verticalLineToRelative(6.5f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.horizontalLineToRelative(6.75f);
        b.curveToRelative(0.62f, 0.0f, 1.15f, -0.38f, 1.38f, -0.91f);
        b.lineToRelative(2.26f, -5.29f);
        b.curveToRelative(0.07f, -0.17f, 0.11f, -0.36f, 0.11f, -0.55f);
        uo.l(b, 12.0f, 6.0f, 22.5f, 10.0f);
        b.horizontalLineToRelative(-6.75f);
        b.curveToRelative(-0.62f, 0.0f, -1.15f, 0.38f, -1.38f, 0.91f);
        b.lineToRelative(-2.26f, 5.29f);
        b.curveToRelative(-0.07f, 0.17f, -0.11f, 0.36f, -0.11f, 0.55f);
        b.lineTo(12.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(5.18f);
        b.lineToRelative(-0.66f, 3.18f);
        b.lineToRelative(-0.02f, 0.24f);
        b.curveToRelative(0.0f, 0.31f, 0.13f, 0.59f, 0.33f, 0.8f);
        b.lineToRelative(0.79f, 0.78f);
        b.lineToRelative(4.94f, -4.94f);
        b.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        b.verticalLineToRelative(-6.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = build;
        build.getClass();
        return build;
    }
}
