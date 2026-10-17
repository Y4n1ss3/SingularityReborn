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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerNotesOffKt {
    private static ImageVector _speakerNotesOff;

    public static final ImageVector getSpeakerNotesOff(Icons.Filled filled) {
        ImageVector imageVector = _speakerNotesOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SpeakerNotesOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.54f, 11.0f, -0.54f, -0.54f);
        e.lineTo(7.54f, 8.0f);
        e.lineTo(6.0f, 6.46f);
        e.lineTo(2.38f, 2.84f);
        e.lineTo(1.27f, 1.73f);
        e.lineTo(0.0f, 3.0f);
        e.lineToRelative(2.01f, 2.01f);
        e.lineTo(2.0f, 22.0f);
        e.lineToRelative(4.0f, -4.0f);
        e.horizontalLineToRelative(9.0f);
        e.lineToRelative(5.73f, 5.73f);
        e.lineTo(22.0f, 22.46f);
        bv.o(e, 17.54f, 18.0f, -7.0f, -7.0f);
        e.moveTo(8.0f, 14.0f);
        af0.m(e, 6.0f, 14.0f, -2.0f, 2.0f);
        r6.l(e, 2.0f, 6.0f, 11.0f);
        e.lineTo(6.0f, 9.0f);
        gy.B(e, 2.0f, 2.0f, 6.0f, 11.0f);
        e.moveTo(20.0f, 2.0f);
        e.lineTo(4.08f, 2.0f);
        e.lineTo(10.0f, 7.92f);
        fc.w(e, 10.0f, 6.0f, 8.0f, 2.0f);
        e.horizontalLineToRelative(-7.92f);
        e.lineToRelative(1.0f, 1.0f);
        af0.m(e, 18.0f, 9.0f, 2.0f, -4.92f);
        e.lineToRelative(6.99f, 6.99f);
        e.curveTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f);
        e.lineTo(22.0f, 4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerNotesOff = build;
        build.getClass();
        return build;
    }
}
