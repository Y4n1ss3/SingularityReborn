package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Rect;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TextToolbarHandler {
    void hideTextToolbar();

    Object showTextToolbar(TextFieldSelectionState textFieldSelectionState, Rect rect, hm hmVar);
}
