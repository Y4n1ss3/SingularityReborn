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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsKt {
    private static ImageVector _directions;

    public static final ImageVector getDirections(Icons.Outlined outlined) {
        ImageVector imageVector = _directions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Directions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.43f, 10.59f, -9.01f, -9.01f);
        e.curveToRelative(-0.75f, -0.75f, -2.07f, -0.76f, -2.83f, 0.0f);
        e.lineToRelative(-9.0f, 9.0f);
        e.curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0.0f, 2.82f);
        e.lineToRelative(9.0f, 9.0f);
        e.curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f);
        e.curveToRelative(0.51f, 0.0f, 1.02f, -0.19f, 1.41f, -0.58f);
        e.lineToRelative(8.99f, -8.99f);
        e.curveToRelative(0.79f, -0.76f, 0.8f, -2.02f, 0.03f, -2.82f);
        k4.x(e, 12.01f, 20.99f, -9.0f, -9.0f);
        e.lineToRelative(9.0f, -9.0f);
        fc.C(e, 9.0f, 9.0f, -9.0f, 9.0f);
        bv.y(e, 8.0f, 11.0f, 4.0f, 2.0f);
        kf0.z(e, -3.0f, 4.0f, 2.5f);
        e.lineToRelative(3.5f, -3.5f);
        e.lineTo(14.0f, 7.5f);
        e.lineTo(14.0f, 10.0f);
        e.lineTo(9.0f, 10.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directions = build;
        build.getClass();
        return build;
    }
}
