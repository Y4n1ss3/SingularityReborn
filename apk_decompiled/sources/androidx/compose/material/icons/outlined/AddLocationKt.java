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
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLocationKt {
    private static ImageVector _addLocation;

    public static final ImageVector getAddLocation(Icons.Outlined outlined) {
        ImageVector imageVector = _addLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(13.0f, 6.0f, 3.0f, 3.0f, 2.0f);
        af0.v(s, -3.0f, 3.0f, -2.0f, -3.0f);
        s.horizontalLineTo(8.0f);
        s.verticalLineTo(9.0f);
        s.horizontalLineToRelative(3.0f);
        s.verticalLineTo(6.0f);
        k4.w(s, 13.0f, 18.0f, 10.2f);
        s.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        s.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        s.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        s.curveTo(16.05f, 15.64f, 18.0f, 12.54f, 18.0f, 10.2f);
        s.close();
        s.moveTo(12.0f, 2.0f);
        s.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        s.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        s.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        s.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLocation = build;
        build.getClass();
        return build;
    }
}
