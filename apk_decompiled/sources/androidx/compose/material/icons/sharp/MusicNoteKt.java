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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MusicNoteKt {
    private static ImageVector _musicNote;

    public static final ImageVector getMusicNote(Icons.Sharp sharp) {
        ImageVector imageVector = _musicNote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MusicNote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(12.0f, 3.0f, 10.55f);
        h.curveToRelative(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
        h.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        h.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        h.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        h.verticalLineTo(7.0f);
        h.horizontalLineToRelative(4.0f);
        h.verticalLineTo(3.0f);
        h.horizontalLineToRelative(-6.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicNote = build;
        build.getClass();
        return build;
    }
}
