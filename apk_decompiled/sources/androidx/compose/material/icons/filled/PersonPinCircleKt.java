package androidx.compose.material.icons.filled;

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

    public static final ImageVector getPersonPinCircle(Icons.Filled filled) {
        ImageVector imageVector = _personPinCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonPinCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        b.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        b.curveTo(19.0f, 5.14f, 15.86f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.11f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.89f, -2.0f, -2.0f);
        b.curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(12.0f, 14.0f);
        b.curveToRelative(-1.67f, 0.0f, -3.14f, -0.85f, -4.0f, -2.15f);
        b.curveToRelative(0.02f, -1.32f, 2.67f, -2.05f, 4.0f, -2.05f);
        b.reflectiveCurveToRelative(3.98f, 0.73f, 4.0f, 2.05f);
        b.curveTo(15.14f, 13.15f, 13.67f, 14.0f, 12.0f, 14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPinCircle = build;
        build.getClass();
        return build;
    }
}
