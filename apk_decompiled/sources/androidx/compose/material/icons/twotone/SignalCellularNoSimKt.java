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
import defpackage.fc;
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalCellularNoSimKt {
    private static ImageVector _signalCellularNoSim;

    public static final ImageVector getSignalCellularNoSim(Icons.TwoTone twoTone) {
        ImageVector imageVector = _signalCellularNoSim;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SignalCellularNoSim", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.83f, 5.0f, 9.36f, 6.47f);
        uf.o(i, 17.0f, 14.11f, 5.0f);
        i.moveTo(7.0f, 9.79f);
        i.verticalLineTo(19.0f);
        i.horizontalLineToRelative(9.23f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(10.83f, 5.0f, 17.0f, 5.0f, 9.11f);
        s.lineToRelative(2.0f, 2.0f);
        s.lineTo(19.0f, 5.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.horizontalLineToRelative(-7.0f);
        s.lineTo(7.94f, 5.06f);
        gy.B(s, 1.42f, 1.42f, 10.83f, 5.0f);
        s.moveTo(21.26f, 21.21f);
        s.lineTo(3.79f, 3.74f);
        s.lineTo(2.38f, 5.15f);
        s.lineTo(5.0f, 7.77f);
        s.lineTo(5.0f, 19.0f);
        s.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(11.23f);
        fc.C(s, 1.62f, 1.62f, 1.41f, -1.41f);
        s.moveTo(7.0f, 19.0f);
        s.lineTo(7.0f, 9.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(s, 16.23f, 19.0f, 7.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularNoSim = build;
        build.getClass();
        return build;
    }
}
