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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Rounded rounded) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneMissed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.09f, 16.2f);
        b.curveToRelative(-6.33f, -5.59f, -15.86f, -5.59f, -22.18f, 0.0f);
        b.curveToRelative(-0.84f, 0.74f, -0.84f, 2.05f, -0.05f, 2.84f);
        b.lineToRelative(1.2f, 1.2f);
        b.curveToRelative(0.71f, 0.71f, 1.84f, 0.77f, 2.62f, 0.15f);
        b.lineToRelative(1.97f, -1.57f);
        b.curveToRelative(0.47f, -0.37f, 0.75f, -0.94f, 0.75f, -1.55f);
        b.verticalLineTo(14.7f);
        b.curveToRelative(2.98f, -0.97f, 6.21f, -0.98f, 9.2f, 0.0f);
        b.verticalLineToRelative(2.58f);
        b.curveToRelative(0.0f, 0.6f, 0.28f, 1.17f, 0.75f, 1.55f);
        b.lineToRelative(1.96f, 1.56f);
        b.curveToRelative(0.79f, 0.62f, 1.91f, 0.56f, 2.62f, -0.15f);
        b.lineToRelative(1.2f, -1.2f);
        b.curveToRelative(0.8f, -0.79f, 0.79f, -2.1f, -0.04f, -2.84f);
        b.close();
        b.moveTo(6.0f, 9.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(6.43f);
        b.lineToRelative(4.24f, 4.24f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(5.66f, -5.66f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-4.95f, 4.95f);
        b.lineTo(8.4f, 5.0f);
        b.horizontalLineTo(10.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getPhoneMissed$annotations(Icons.Rounded rounded) {
    }
}
