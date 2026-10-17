package androidx.compose.material.icons.automirrored.rounded;

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
public final class ArrowBackIosKt {
    private static ImageVector _arrowBackIos;

    public static final ImageVector getArrowBackIos(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _arrowBackIos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.ArrowBackIos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.62f, 2.99f);
        b.curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f);
        b.lineTo(6.54f, 11.3f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(8.31f, 8.31f);
        b.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        b.reflectiveCurveToRelative(0.49f, -1.28f, 0.0f, -1.77f);
        b.lineTo(9.38f, 12.0f);
        b.lineToRelative(7.25f, -7.25f);
        b.curveToRelative(0.48f, -0.48f, 0.48f, -1.28f, -0.01f, -1.76f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowBackIos = build;
        build.getClass();
        return build;
    }
}
