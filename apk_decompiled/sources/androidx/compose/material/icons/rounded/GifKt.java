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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GifKt {
    private static ImageVector _gif;

    public static final ImageVector getGif(Icons.Rounded rounded) {
        ImageVector imageVector = _gif;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gif", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.25f, 9.0f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        b.verticalLineToRelative(4.5f);
        b.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        b.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        b.verticalLineToRelative(-4.5f);
        b.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        b.close();
        b.moveTo(10.0f, 9.75f);
        b.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        b.lineTo(6.0f, 9.0f);
        b.curveToRelative(-0.6f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.25f);
        b.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        b.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        r6.D(b, 0.75f, -2.0f, -3.0f, 2.75f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.close();
        b.moveTo(19.0f, 9.75f);
        b.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        b.lineTo(15.5f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.25f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.lineTo(16.0f, 13.0f);
        b.horizontalLineToRelative(1.25f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        af0.m(b, 16.0f, 11.5f, -1.0f, 2.25f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gif = build;
        build.getClass();
        return build;
    }
}
