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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CodeOffKt {
    private static ImageVector _codeOff;

    public static final ImageVector getCodeOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _codeOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CodeOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.17f, 12.0f, -4.58f, -4.59f);
        e.lineTo(16.0f, 6.0f);
        e.lineToRelative(6.0f, 6.0f);
        e.lineToRelative(-3.59f, 3.59f);
        r6.C(e, 17.0f, 14.17f, 19.17f, 12.0f);
        e.moveTo(1.39f, 4.22f);
        e.lineToRelative(4.19f, 4.19f);
        e.lineTo(2.0f, 12.0f);
        e.lineToRelative(6.0f, 6.0f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineTo(4.83f, 12.0f);
        e.lineTo(7.0f, 9.83f);
        e.lineToRelative(12.78f, 12.78f);
        e.lineToRelative(1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 2.81f, 2.81f, 1.39f, 4.22f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _codeOff = build;
        build.getClass();
        return build;
    }
}
