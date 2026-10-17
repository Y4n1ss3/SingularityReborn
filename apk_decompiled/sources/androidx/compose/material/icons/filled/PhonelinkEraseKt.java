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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkEraseKt {
    private static ImageVector _phonelinkErase;

    public static final ImageVector getPhonelinkErase(Icons.Filled filled) {
        ImageVector imageVector = _phonelinkErase;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhonelinkErase", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 8.2f, -1.0f, -1.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-1.0f, 1.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(1.0f, 1.0f);
        e.lineToRelative(4.0f, -4.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(1.0f, -1.0f);
        fc.C(e, -4.0f, -4.0f, 4.0f, -4.0f);
        e.moveTo(19.0f, 1.0f);
        e.horizontalLineTo(9.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k4.l(e, 3.0f, 2.0f, 4.0f, 10.0f);
        af0.s(e, 16.0f, 9.0f, -2.0f, 7.0f);
        e.verticalLineToRelative(3.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(3.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkErase = build;
        build.getClass();
        return build;
    }
}
