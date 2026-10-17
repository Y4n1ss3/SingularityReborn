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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoneOutlineKt {
    private static ImageVector _doneOutline;

    public static final ImageVector getDoneOutline(Icons.Sharp sharp) {
        ImageVector imageVector = _doneOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoneOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.77f, 4.93f, 1.4f, 1.4f);
        e.lineTo(8.43f, 19.07f);
        e.lineToRelative(-5.6f, -5.6f);
        e.lineToRelative(1.4f, -1.4f);
        e.lineToRelative(4.2f, 4.2f);
        e.lineTo(19.77f, 4.93f);
        e.moveToRelative(0.0f, -2.83f);
        e.lineTo(8.43f, 13.44f);
        e.lineToRelative(-4.2f, -4.2f);
        e.lineTo(0.0f, 13.47f);
        e.lineToRelative(8.43f, 8.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 24.0f, 6.33f, 19.77f, 2.1f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doneOutline = build;
        build.getClass();
        return build;
    }
}
