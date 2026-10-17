package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardCommandKeyKt {
    private static ImageVector _keyboardCommandKey;

    public static final ImageVector getKeyboardCommandKey(Icons.TwoTone twoTone) {
        ImageVector imageVector = _keyboardCommandKey;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.KeyboardCommandKey", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 3.0f);
        b.curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        uf.z(b, 8.0f, -4.0f, 6.5f);
        b.curveTo(10.0f, 4.57f, 8.43f, 3.0f, 6.5f, 3.0f);
        b.reflectiveCurveTo(3.0f, 4.57f, 3.0f, 6.5f);
        b.reflectiveCurveTo(4.57f, 10.0f, 6.5f, 10.0f);
        r6.y(b, 8.0f, 4.0f, 6.5f);
        b.curveTo(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f);
        b.reflectiveCurveTo(4.57f, 21.0f, 6.5f, 21.0f);
        b.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        kf0.r(b, 16.0f, 4.0f, 1.5f);
        b.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        b.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(19.43f, 14.0f, 17.5f, 14.0f);
        af0.u(b, 16.0f, -4.0f, 1.5f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(19.43f, 3.0f, 17.5f, 3.0f);
        uo.l(b, 17.5f, 3.0f, 16.0f, 8.0f);
        b.verticalLineTo(6.5f);
        b.curveTo(16.0f, 5.67f, 16.67f, 5.0f, 17.5f, 5.0f);
        b.reflectiveCurveTo(19.0f, 5.67f, 19.0f, 6.5f);
        b.reflectiveCurveTo(18.33f, 8.0f, 17.5f, 8.0f);
        kf0.m(b, 16.0f, 16.0f, 8.0f);
        b.moveTo(6.5f, 8.0f);
        b.curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        b.reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f);
        b.reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f);
        b.verticalLineTo(8.0f);
        b.horizontalLineTo(6.5f);
        b.lineTo(6.5f, 8.0f);
        b.close();
        bv.y(b, 10.0f, 14.0f, -4.0f, 4.0f);
        b.verticalLineToRelative(4.0f);
        b.horizontalLineTo(10.0f);
        b.lineTo(10.0f, 14.0f);
        b.close();
        b.moveTo(17.5f, 19.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.verticalLineTo(16.0f);
        b.horizontalLineToRelative(1.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(18.33f, 19.0f, 17.5f, 19.0f);
        uo.l(b, 17.5f, 19.0f, 6.5f, 19.0f);
        b.curveTo(5.67f, 19.0f, 5.0f, 18.33f, 5.0f, 17.5f);
        b.reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f);
        b.horizontalLineTo(8.0f);
        b.verticalLineToRelative(1.5f);
        b.curveTo(8.0f, 18.33f, 7.33f, 19.0f, 6.5f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 6.5f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardCommandKey = build;
        build.getClass();
        return build;
    }
}
