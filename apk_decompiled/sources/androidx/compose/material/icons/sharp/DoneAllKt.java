package androidx.compose.material.icons.sharp;

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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoneAllKt {
    private static ImageVector _doneAll;

    public static final ImageVector getDoneAll(Icons.Sharp sharp) {
        ImageVector imageVector = _doneAll;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoneAll", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 7.0f, -1.41f, -1.41f);
        e.lineToRelative(-6.34f, 6.34f);
        gy.B(e, 1.41f, 1.41f, 18.0f, 7.0f);
        e.moveTo(22.24f, 5.59f);
        e.lineTo(11.66f, 16.17f);
        e.lineTo(7.48f, 12.0f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineTo(11.66f, 19.0f);
        fc.C(e, 12.0f, -12.0f, -1.42f, -1.41f);
        e.moveTo(0.41f, 13.41f);
        e.lineTo(6.0f, 19.0f);
        e.lineToRelative(1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 1.83f, 12.0f, 0.41f, 13.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doneAll = build;
        build.getClass();
        return build;
    }
}
