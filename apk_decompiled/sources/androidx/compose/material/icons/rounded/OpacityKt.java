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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpacityKt {
    private static ImageVector _opacity;

    public static final ImageVector getOpacity(Icons.Rounded rounded) {
        ImageVector imageVector = _opacity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Opacity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.65f, 7.56f, 17.65f, 7.56f);
        i.lineTo(12.7f, 2.69f);
        i.curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0.0f);
        i.lineTo(6.35f, 7.56f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f);
        i.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        i.curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f);
        i.curveTo(20.0f, 10.96f, 19.1f, 8.99f, 17.65f, 7.56f);
        k4.r(i, 7.75f, 8.99f, 12.0f, 4.81f);
        i.lineToRelative(4.25f, 4.18f);
        i.curveToRelative(0.88f, 0.87f, 2.04f, 2.59f, 1.67f, 5.01f);
        i.horizontalLineTo(6.07f);
        i.curveTo(5.7f, 11.58f, 6.87f, 9.85f, 7.75f, 8.99f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _opacity = build;
        build.getClass();
        return build;
    }
}
