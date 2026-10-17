package androidx.compose.material.icons.rounded;

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

    public static final ImageVector getMusicNote(Icons.Rounded rounded) {
        ImageVector imageVector = _musicNote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MusicNote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(12.0f, 5.0f, 8.55f);
        h.curveToRelative(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f);
        h.curveToRelative(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f);
        h.curveToRelative(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f);
        h.curveToRelative(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f);
        h.verticalLineTo(7.0f);
        h.horizontalLineToRelative(2.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        h.horizontalLineToRelative(-2.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicNote = build;
        build.getClass();
        return build;
    }
}
