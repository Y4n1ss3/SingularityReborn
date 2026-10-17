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
import defpackage.er;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackspaceKt {
    private static ImageVector _backspace;

    public static final ImageVector getBackspace(Icons.TwoTone twoTone) {
        ImageVector imageVector = _backspace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Backspace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.06f, 5.0f, 2.4f, 12.0f);
        kp0.v(i, 4.67f, 7.0f, 22.0f, 5.0f);
        i.horizontalLineTo(7.06f);
        i.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f);
        k4.r(i, 9.0f, 8.41f, 10.41f, 7.0f);
        i.lineTo(14.0f, 10.59f);
        i.lineTo(17.59f, 7.0f);
        i.lineTo(19.0f, 8.41f);
        i.lineTo(15.41f, 12.0f);
        i.lineTo(19.0f, 15.59f);
        i.lineTo(17.59f, 17.0f);
        i.lineTo(14.0f, 13.41f);
        i.lineTo(10.41f, 17.0f);
        i.lineTo(9.0f, 15.59f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 12.59f, 12.0f, 9.0f, 8.41f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(22.0f, 3.0f, 7.0f, 3.0f);
        i2.curveToRelative(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        i2.lineTo(0.0f, 12.0f);
        i2.lineToRelative(5.41f, 8.11f);
        i2.curveToRelative(0.36f, 0.53f, 0.9f, 0.89f, 1.59f, 0.89f);
        i2.horizontalLineToRelative(15.0f);
        i2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i2.lineTo(24.0f, 5.0f);
        i2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i2, 22.0f, 19.0f, 7.07f, 19.0f);
        i2.lineTo(2.4f, 12.0f);
        i2.lineToRelative(4.66f, -7.0f);
        bv.r(i2, 22.0f, 5.0f, 14.0f);
        i2.moveTo(10.41f, 17.0f);
        i2.lineTo(14.0f, 13.41f);
        i2.lineTo(17.59f, 17.0f);
        i2.lineTo(19.0f, 15.59f);
        i2.lineTo(15.41f, 12.0f);
        i2.lineTo(19.0f, 8.41f);
        i2.lineTo(17.59f, 7.0f);
        i2.lineTo(14.0f, 10.59f);
        i2.lineTo(10.41f, 7.0f);
        i2.lineTo(9.0f, 8.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i2, 12.59f, 12.0f, 9.0f, 15.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backspace = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getBackspace$annotations(Icons.TwoTone twoTone) {
    }
}
