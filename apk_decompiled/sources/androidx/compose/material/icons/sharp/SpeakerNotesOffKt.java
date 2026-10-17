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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerNotesOffKt {
    private static ImageVector _speakerNotesOff;

    public static final ImageVector getSpeakerNotesOff(Icons.Sharp sharp) {
        ImageVector imageVector = _speakerNotesOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SpeakerNotesOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.27f, 1.73f, 0.0f, 3.0f);
        i.lineToRelative(2.01f, 2.01f);
        i.lineTo(2.0f, 22.0f);
        i.lineToRelative(4.0f, -4.0f);
        i.horizontalLineToRelative(9.0f);
        i.lineToRelative(5.73f, 5.73f);
        r6.C(i, 22.0f, 22.46f, 1.27f, 1.73f);
        i.moveTo(8.0f, 14.0f);
        af0.m(i, 6.0f, 14.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 6.0f, 11.0f);
        i.lineTo(6.0f, 9.0f);
        gy.B(i, 2.0f, 2.0f, 6.0f, 11.0f);
        i.moveTo(22.0f, 2.0f);
        i.lineTo(4.08f, 2.0f);
        i.lineTo(10.0f, 7.92f);
        fc.w(i, 10.0f, 6.0f, 8.0f, 2.0f);
        i.horizontalLineToRelative(-7.92f);
        i.lineToRelative(1.0f, 1.0f);
        af0.m(i, 18.0f, 9.0f, 2.0f, -4.92f);
        i.lineToRelative(6.99f, 6.99f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 22.0f, 17.99f, 22.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerNotesOff = build;
        build.getClass();
        return build;
    }
}
