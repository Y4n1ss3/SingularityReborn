package androidx.compose.material.icons.outlined;

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
import defpackage.er;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RotateLeftKt {
    private static ImageVector _rotateLeft;

    public static final ImageVector getRotateLeft(Icons.Outlined outlined) {
        ImageVector imageVector = _rotateLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RotateLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.11f, 8.53f, 5.7f, 7.11f);
        i.curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11.0f);
        i.horizontalLineToRelative(2.02f);
        i.curveToRelative(0.14f, -0.87f, 0.49f, -1.72f, 1.02f, -2.47f);
        k4.r(i, 6.09f, 13.0f, 4.07f, 13.0f);
        i.curveToRelative(0.17f, 1.39f, 0.72f, 2.73f, 1.62f, 3.89f);
        i.lineToRelative(1.41f, -1.42f);
        i.curveToRelative(-0.52f, -0.75f, -0.87f, -1.59f, -1.01f, -2.47f);
        i.close();
        i.moveTo(7.1f, 18.32f);
        i.curveToRelative(1.16f, 0.9f, 2.51f, 1.44f, 3.9f, 1.61f);
        i.lineTo(11.0f, 17.9f);
        i.curveToRelative(-0.87f, -0.15f, -1.71f, -0.49f, -2.46f, -1.03f);
        uo.l(i, 7.1f, 18.32f, 13.0f, 4.07f);
        i.lineTo(13.0f, 1.0f);
        i.lineTo(8.45f, 5.55f);
        i.lineTo(13.0f, 10.0f);
        i.lineTo(13.0f, 6.09f);
        i.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        i.reflectiveCurveToRelative(-2.16f, 5.43f, -5.0f, 5.91f);
        i.verticalLineToRelative(2.02f);
        i.curveToRelative(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -3.05f, -7.44f, -7.0f, -7.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateLeft = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getRotateLeft$annotations(Icons.Outlined outlined) {
    }
}
