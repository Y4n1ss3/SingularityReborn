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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CheckroomKt {
    private static ImageVector _checkroom;

    public static final ImageVector getCheckroom(Icons.Outlined outlined) {
        ImageVector imageVector = _checkroom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Checkroom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.6f, 18.2f, 13.0f, 11.75f, -0.91f);
        s.curveToRelative(1.65f, -0.49f, 2.8f, -2.17f, 2.43f, -4.05f);
        s.curveToRelative(-0.26f, -1.31f, -1.3f, -2.4f, -2.61f, -2.7f);
        s.curveTo(10.54f, 3.57f, 8.5f, 5.3f, 8.5f, 7.5f);
        s.horizontalLineToRelative(2.0f);
        s.curveTo(10.5f, 6.67f, 11.17f, 6.0f, 12.0f, 6.0f);
        s.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        s.curveToRelative(0.0f, 0.84f, -0.69f, 1.52f, -1.53f, 1.5f);
        s.curveTo(11.43f, 8.99f, 11.0f, 9.45f, 11.0f, 9.99f);
        s.verticalLineToRelative(1.76f);
        s.lineTo(2.4f, 18.2f);
        s.curveTo(1.63f, 18.78f, 2.04f, 20.0f, 3.0f, 20.0f);
        s.horizontalLineToRelative(9.0f);
        s.horizontalLineToRelative(9.0f);
        s.curveTo(21.96f, 20.0f, 22.37f, 18.78f, 21.6f, 18.2f);
        k4.x(s, 6.0f, 18.0f, 6.0f, -4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(s, 6.0f, 4.5f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _checkroom = build;
        build.getClass();
        return build;
    }
}
