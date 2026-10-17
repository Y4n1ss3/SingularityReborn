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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoFixHighKt {
    private static ImageVector _autoFixHigh;

    public static final ImageVector getAutoFixHigh(Icons.Filled filled) {
        ImageVector imageVector = _autoFixHigh;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AutoFixHigh", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.5f, 5.6f, 10.0f, 7.0f);
        i.lineTo(8.6f, 4.5f);
        i.lineTo(10.0f, 2.0f);
        i.lineTo(7.5f, 3.4f);
        i.lineTo(5.0f, 2.0f);
        gy.B(i, 1.4f, 2.5f, 5.0f, 7.0f);
        i.moveTo(19.5f, 15.4f);
        i.lineTo(17.0f, 14.0f);
        i.lineToRelative(1.4f, 2.5f);
        i.lineTo(17.0f, 19.0f);
        i.lineToRelative(2.5f, -1.4f);
        i.lineTo(22.0f, 19.0f);
        gy.B(i, -1.4f, -2.5f, 22.0f, 14.0f);
        i.moveTo(22.0f, 2.0f);
        i.lineToRelative(-2.5f, 1.4f);
        i.lineTo(17.0f, 2.0f);
        i.lineToRelative(1.4f, 2.5f);
        i.lineTo(17.0f, 7.0f);
        i.lineToRelative(2.5f, -1.4f);
        bv.o(i, 22.0f, 7.0f, -1.4f, -2.5f);
        i.moveTo(14.37f, 7.29f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineTo(1.29f, 18.96f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(2.34f, 2.34f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineTo(16.7f, 11.05f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        fc.B(i, -2.33f, -2.35f, 13.34f, 12.78f);
        i.lineToRelative(-2.12f, -2.12f);
        i.lineToRelative(2.44f, -2.44f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 2.12f, 2.12f, -2.44f, 2.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixHigh = build;
        build.getClass();
        return build;
    }
}
