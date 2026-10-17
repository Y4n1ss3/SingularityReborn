package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputKt {
    private static ImageVector _input;

    public static final ImageVector getInput(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _input;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.Input", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 3.01f, 3.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gy.z(d, 9.0f, 2.0f, 4.99f, 18.0f);
        gy.A(d, 14.03f, 3.0f, 15.0f, 1.0f);
        d.verticalLineToRelative(4.01f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
        d.verticalLineToRelative(-14.0f);
        d.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(d, 11.0f, 16.0f, 4.0f, -4.0f);
        gy.j(d, -4.0f, -4.0f, 3.0f, 1.0f);
        r6.p(d, 2.0f, 10.0f, 3.0f);
        d.moveTo(21.0f, 3.01f);
        d.horizontalLineTo(3.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gy.z(d, 9.0f, 2.0f, 4.99f, 18.0f);
        gy.A(d, 14.03f, 3.0f, 15.0f, 1.0f);
        d.verticalLineToRelative(4.01f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
        d.verticalLineToRelative(-14.0f);
        d.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(d, 11.0f, 16.0f, 4.0f, -4.0f);
        gy.j(d, -4.0f, -4.0f, 3.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(d, 2.0f, 10.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _input = build;
        build.getClass();
        return build;
    }
}
