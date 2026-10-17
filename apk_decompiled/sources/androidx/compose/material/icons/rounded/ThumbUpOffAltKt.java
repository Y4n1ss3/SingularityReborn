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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpOffAltKt {
    private static ImageVector _thumbUpOffAlt;

    public static final ImageVector getThumbUpOffAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _thumbUpOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbUpOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(13.12f, 2.06f, 7.58f, 7.6f);
        i.curveTo(7.21f, 7.97f, 7.0f, 8.48f, 7.0f, 9.01f);
        i.verticalLineTo(19.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(9.0f);
        i.curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        i.lineToRelative(3.26f, -7.61f);
        i.curveTo(23.94f, 10.2f, 22.49f, 8.0f, 20.34f, 8.0f);
        i.horizontalLineToRelative(-5.65f);
        i.lineToRelative(0.95f, -4.58f);
        i.curveToRelative(0.1f, -0.5f, -0.05f, -1.01f, -0.41f, -1.37f);
        i.curveTo(14.64f, 1.47f, 13.7f, 1.47f, 13.12f, 2.06f);
        i.close();
        i.moveTo(3.0f, 21.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineToRelative(-8.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(8.0f);
        i.curveTo(1.0f, 20.1f, 1.9f, 21.0f, 3.0f, 21.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpOffAlt = build;
        build.getClass();
        return build;
    }
}
