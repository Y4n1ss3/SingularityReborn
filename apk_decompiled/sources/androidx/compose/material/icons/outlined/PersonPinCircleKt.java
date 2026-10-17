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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonPinCircleKt {
    private static ImageVector _personPinCircle;

    public static final ImageVector getPersonPinCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _personPinCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonPinCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 11.0f);
        b.curveToRelative(1.33f, 0.0f, 4.0f, 0.67f, 4.0f, 2.0f);
        b.verticalLineToRelative(0.16f);
        b.curveToRelative(-0.97f, 1.12f, -2.4f, 1.84f, -4.0f, 1.84f);
        b.reflectiveCurveToRelative(-3.03f, -0.72f, -4.0f, -1.84f);
        b.lineTo(8.0f, 13.0f);
        b.curveToRelative(0.0f, -1.33f, 2.67f, -2.0f, 4.0f, -2.0f);
        b.close();
        b.moveTo(12.0f, 10.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.close();
        b.moveTo(18.0f, 10.2f);
        b.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        b.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        b.curveToRelative(4.05f, -3.7f, 6.0f, -6.8f, 6.0f, -9.14f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        b.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        b.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPinCircle = build;
        build.getClass();
        return build;
    }
}
