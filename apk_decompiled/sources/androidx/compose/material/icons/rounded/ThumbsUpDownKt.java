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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Rounded rounded) {
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbsUpDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(10.06f, 5.0f, 5.82f, 0.66f, -3.18f);
        a.curveToRelative(0.08f, -0.37f, -0.04f, -0.75f, -0.3f, -1.02f);
        a.curveTo(5.74f, 0.36f, 5.03f, 0.36f, 4.6f, 0.8f);
        a.lineToRelative(-4.0f, 4.0f);
        a.curveToRelative(-0.39f, 0.37f, -0.6f, 0.88f, -0.6f, 1.41f);
        a.verticalLineTo(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(5.92f);
        a.curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        a.lineToRelative(2.14f, -5.0f);
        a.curveTo(12.46f, 6.47f, 11.49f, 5.0f, 10.06f, 5.0f);
        af0.l(a, 22.0f, 10.0f, -5.92f);
        a.curveToRelative(-0.8f, 0.0f, -1.52f, 0.48f, -1.84f, 1.21f);
        a.lineToRelative(-2.14f, 5.0f);
        a.curveToRelative(-0.56f, 1.32f, 0.4f, 2.79f, 1.84f, 2.79f);
        a.horizontalLineToRelative(4.24f);
        a.lineToRelative(-0.66f, 3.18f);
        a.curveToRelative(-0.08f, 0.37f, 0.04f, 0.75f, 0.3f, 1.02f);
        a.curveToRelative(0.44f, 0.44f, 1.15f, 0.44f, 1.58f, 0.0f);
        a.lineToRelative(4.0f, -4.0f);
        a.curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f);
        a.verticalLineTo(12.0f);
        a.curveToRelative(0.01f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = build;
        build.getClass();
        return build;
    }
}
