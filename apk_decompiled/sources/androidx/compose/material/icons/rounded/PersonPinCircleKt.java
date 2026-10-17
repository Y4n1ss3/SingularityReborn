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
public final class PersonPinCircleKt {
    private static ImageVector _personPinCircle;

    public static final ImageVector getPersonPinCircle(Icons.Rounded rounded) {
        ImageVector imageVector = _personPinCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PersonPinCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.22f);
        b.curveToRelative(0.36f, 0.32f, 0.97f, 0.32f, 1.33f, 0.0f);
        b.curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        b.curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(7.69f, 12.49f);
        b.curveTo(8.88f, 11.56f, 10.37f, 11.0f, 12.0f, 11.0f);
        b.reflectiveCurveToRelative(3.12f, 0.56f, 4.31f, 1.49f);
        b.curveTo(15.45f, 13.98f, 13.85f, 15.0f, 12.0f, 15.0f);
        b.reflectiveCurveTo(8.55f, 13.98f, 7.69f, 12.49f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.curveTo(10.0f, 6.9f, 10.9f, 6.0f, 12.0f, 6.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPinCircle = build;
        build.getClass();
        return build;
    }
}
