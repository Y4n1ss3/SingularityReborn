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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RampRightKt {
    private static ImageVector _rampRight;

    public static final ImageVector getRampRight(Icons.Rounded rounded) {
        ImageVector imageVector = _rampRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RampRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 21.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(6.83f);
        b.lineToRelative(0.88f, 0.88f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(-2.59f, -2.59f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineTo(8.71f, 6.29f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineTo(11.0f, 6.83f);
        b.verticalLineToRelative(0.0f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(0.0f, 3.62f, -2.89f, 6.22f, -4.97f, 7.62f);
        b.curveToRelative(-0.52f, 0.35f, -0.59f, 1.09f, -0.14f, 1.53f);
        b.curveToRelative(0.33f, 0.33f, 0.87f, 0.4f, 1.26f, 0.13f);
        b.curveToRelative(1.59f, -1.06f, 2.89f, -2.28f, 3.85f, -3.59f);
        b.lineToRelative(0.0f, 5.3f);
        b.curveTo(11.0f, 20.55f, 11.45f, 21.0f, 12.0f, 21.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rampRight = build;
        build.getClass();
        return build;
    }
}
