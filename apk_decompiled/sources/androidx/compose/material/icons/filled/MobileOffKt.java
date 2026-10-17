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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileOffKt {
    private static ImageVector _mobileOff;

    public static final ImageVector getMobileOff(Icons.Filled filled) {
        ImageVector imageVector = _mobileOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MobileOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.76f, 2.49f, 1.49f, 3.76f);
        i.lineTo(5.0f, 7.27f);
        i.verticalLineTo(21.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.02f, 0.0f, 1.85f, -0.77f, 1.98f, -1.75f);
        i.lineToRelative(1.72f, 1.72f);
        gy.B(i, 1.27f, -1.27f, 2.76f, 2.49f);
        i.moveTo(7.0f, 19.0f);
        i.verticalLineTo(9.27f);
        i.lineTo(16.73f, 19.0f);
        i.horizontalLineTo(7.0f);
        i.close();
        i.moveTo(17.0f, 5.0f);
        k4.z(i, 9.17f, 2.0f, 2.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineTo(7.0f);
        i.curveToRelative(-0.85f, 0.0f, -1.58f, 0.54f, -1.87f, 1.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(i, 7.83f, 5.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileOff = build;
        build.getClass();
        return build;
    }
}
